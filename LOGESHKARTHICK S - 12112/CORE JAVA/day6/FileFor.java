package core.day6;
class InvalidFileFormat extends Exception
{
	public InvalidFileFormat(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
class ValidFileForm
{
	 ValidFileForm (String fileName) throws InvalidFileFormat
	{
		String [] str =fileName.split("\\.");
		if(!str[1].equals("pdf")||!str[1].equals("docx"))
		{
			System.out.println("file processing ");
			
		}
		else
			throw new InvalidFileFormat("ilid file format : please provide pdf and docx");
		
			
		
	}
	
}
public class FileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidFileForm vl =new ValidFileForm("java8.txt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
