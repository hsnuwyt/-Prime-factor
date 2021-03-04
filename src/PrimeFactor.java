//104403012 資管3A 吳彥廷
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.*;


public class PrimeFactor {
	private static Iterator<Integer> it;
	private static TreeSet<Integer> ts;
	private static int count;      //用來判斷因數是否為質數
	private static int factorcount;//算質因數個數
	
	
	public static void main(String[] args) {
		while(true) {
			try {
				String s = JOptionPane.showInputDialog("輸入一個整數");
				if(s==null) {System.exit(0);}//判斷取消離開
				Integer.parseInt(s);
				int n = Integer.parseInt(s);
				Set<Integer> factor = new HashSet<Integer>();
				count = 0;
				factorcount = 0;
				int originalnum = n;
				if(n>0) {           //判斷是否為正數
				   for(int i=2;i<n;i++){ //質因數算法
						if(n%i==0){
							for(int j=2;j<=i;j++){
								if(i%j==0){             //判斷因數是否為值因數式
									count++;
									if(count>1){
										break;
									}
								}
						
							}			
							if(count==1){						
							    factorcount++;
								factor.add(i);					
							}
						}
						count = 0;										
				  }
					if(factorcount==0) {
						JOptionPane.showMessageDialog(null, originalnum+"是值數");
					}
					else {
						ts = new TreeSet<Integer>(factor);
				      	it = ts.iterator();
						if(it.hasNext())
						{
							for(int q=1;q<=factorcount;q++) {
							JOptionPane.showMessageDialog(null,originalnum+"的質因數包含: "+(int)it.next(),"質因數"+q+"/"+factorcount,JOptionPane.PLAIN_MESSAGE);
							}
						}	
				    }					
				}
				else {
					JOptionPane.showMessageDialog(null,"輸入正整數好ㄇ");
				}
			}
			catch (NumberFormatException e){  //判斷是否為整數
				JOptionPane.showMessageDialog(null,"輸入正整數好ㄇ");
			}
		}
	}
}
