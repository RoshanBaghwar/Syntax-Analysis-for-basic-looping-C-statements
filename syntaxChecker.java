import java.util.*;
import java.io.*;

public class syntaxChecker extends syntaxGrammarBaseListener
{
    private List<String> errors = new ArrayList<>();

    public List<String> getErrors()
    {
        return errors;
    }

    @Override
    public void enterWhile_loop(syntaxGrammarParser.While_loopContext ctx) 
    {
        TerminalNode node = ctx.Identifier();
        String loopName = node.getText();

        if(Character.isUpperCase(loopName.charAt(0)))
        {
            String error = String.format("Loop name %s is invalid!", loopName);
            errors.add(error);
        }
    }

    public static void main(String args[]) throws Exception
    {
        System.out.println("Enter the C file directory");
        
        Scanner ob = new Scanner(System.in);
        String filePath = ob.nextLine();
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        String fileContent = "";
        while(sc.hasNextLine())
        fileContent = fileContent + sc.nextLine() + "\n";
        
        // Constructing the Lexer.
        syntaxGrammarLexer lexer = new syntaxGrammarLexer(CharStreams.fromString(fileContent));

        // Instantiating the Parser.
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        syntaxGrammarParser parser = new syntaxGrammarParser(tokens);
        ParseTree tree = parser.compilationUnit();

        // Invoking the Walker and the Listner.
        ParseTreeWalker walker = new ParseTreeWalker();
        syntaxChecker listner = new syntaxChecker();

        // Now we tell ANTLR to walk through our sample C code.
        walker.walk(listener, tree);

        assertThat(listener.getErrors().size(), is(1));
        assertThat(listener.getErrors().get(0), is("Loop name is uppercased!"));

    }

}