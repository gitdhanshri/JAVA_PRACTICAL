import java.io.*;
class CountFile_Folder{
	int countFile=0;
	int countFolder=0;
	int countEndsWithJava=0;
	int countEndsWithClass=0;
	int countTxtFile=0;
int countFolder(String path)throws ownException{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			boolean res2=listOfAllFile[i].isFile();
			if(res==true){
			String s=listOfAllFile[i].getPath();

				 countFolder=countFolder+1;
				countFolder(s);
			}
			else if(res2==true){

				countFile++;	
			}
			else{
				return 0;	
			}
		}
		}
		catch(Exception e){
			System.out.println("error msg");
		}
return countFolder;
}
int countFiles(String path)throws ownException{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			boolean res2=listOfAllFile[i].isFile();
			if(res2==true){
				String s=listOfAllFile[i].getPath();
				 countFile=countFile+1;
			}
			else if(res==true){
				countFolder++;
				String s=listOfAllFile[i].getPath();
				countFiles(s);
			}
			else{
				return 0;	
			}
		}
		}
		catch(Exception e){
			System.out.println("error msg");
		}
return countFile;
}
void endsWithFiles(String path)throws Exception{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean isFile=listOfAllFile[i]. isFile();
			boolean isDir=listOfAllFile[i].isDirectory ();			

			String s=listOfAllFile[i].getPath();
				if(isFile==true){
						String filePath=listOfAllFile[i].getPath();
						boolean endsjava=filePath.endsWith(".java");
						boolean endsClass=s.endsWith(".class");
						boolean endsWithTxt=s.endsWith(".txt");
						if(endsjava==true){
							countEndsWithJava++;
							countFile++;
						}
						else if(endsClass==true){
							countEndsWithClass++;														
							countFile++;
						}
						else if(endsWithTxt==true){
							countTxtFile++;														
							countFile++;
						}
				}
				 else if(isDir==true){
					countFolder++;
					int p=0;
					endsWithFiles(s);
				}
				else{
					countFile++;
				}

			}
	 }
	 catch(Exception e){
		System.out.println("errMsg");
	 }	
}
	public static void main(String args[])throws Exception{
		CountFile_Folder obj1=new CountFile_Folder();
		obj1.endsWithFiles("/home/dhanshri/java/java_practice/file");
		System.out.println("Number of  Total Files-->"+obj1.countFile);
		System.out.println("Number of  java Files-->"+obj1.countEndsWithJava);
		System.out.println("Number of  Class Files-->"+obj1.countEndsWithClass);
		System.out.println("Number of Folder-->"+obj1.countFolder);
	}
}
class ownException extends Exception{
	public ownException(String error){
		super(error);
	}
}
