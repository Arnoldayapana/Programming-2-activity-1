package RemoveAllSpace;

public class RemoveAllSpace {

  public static void main(String[] args) {
  String str= "Programing isNot   Easy";
  
  //1st way
String noSpaceStr = str.replaceAll("\\s","");//using built it method

System.out.println(noSpaceStr);
//2nd way
char[] strArray = str.toCharArray();
StringBuffer stringBuffer= new StringBuffer();
for (int i=0; i < strArray.length; i++){
  if ((strArray[i]!= ' ')&&(strArray[i]!='\t')){
    
    stringBuffer.append(strArray[i]);
  }
}

  }

}
