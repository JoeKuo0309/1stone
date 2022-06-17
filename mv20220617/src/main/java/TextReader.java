import java.io.*;
public class TextReader {

	public static void main(String[] args) throws IOException {
	   InputStream in=new FileInputStream("c:/tmp/demo.txt"); //自己放個file測試
	   InputStreamReader ir=new InputStreamReader(in,"big5");
	   BufferedReader br=new BufferedReader(ir);
	   String line=null;
	   while((line=br.readLine())!=null) {
		   System.out.println(line);
	   }
	   br.close();
       in.close();
	}

}
