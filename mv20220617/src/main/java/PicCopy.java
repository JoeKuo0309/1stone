import java.io.*;
public class PicCopy {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub 
		InputStream in=new FileInputStream("c:/tmp/img12.jpg"); //自己放個picture測試
		OutputStream out=new FileOutputStream("c:/tmp/img12_1.jpg");
        byte[]   bt=new byte[4096];
        int size=0;
        while((size=in.read(bt))>0) {
        	out.write(bt, 0, size);
        }
        in.close();
        out.close();
        System.out.println("Saved");
	}

}
