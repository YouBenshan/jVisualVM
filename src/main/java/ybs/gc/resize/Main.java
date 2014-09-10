package ybs.gc.resize;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;


public class Main {

	private static final List<SoftReference<StringBuilder>> references = new ArrayList<>();
	
	private static final int size=1<<22;
	
	public static void main(String[] args) throws  InterruptedException {
		boolean flag=false;
		if(args.length>0){
			flag=Boolean.valueOf(args[0]);
		}
		while(true){
			StringBuilder sb=null;
			if(flag){
				sb=new StringBuilder(size);
			}else{
				sb=new StringBuilder();
			}
			
			for(int i=0; i<size;i++){
				sb.append("i");
			}
			SoftReference<StringBuilder> reference =new SoftReference<>(sb);
			references.add(reference);
			Thread.sleep(500);
		}
		
		
	}

}
