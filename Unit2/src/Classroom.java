public class Classroom 
{
	private Student s1, s2, s3;
	
	public Classroom(Student one, Student two, Student three)
	{
		s1 = one;
		s2 = two;
		s3 = three;
		
	}
	public double bestAverage()
	{
		double s1avg = s1.getAverage();
		double s2avg = s2.getAverage();
		double s3avg = s3.getAverage();
		return (Math.max(s3avg, (Math.max(s1avg, s2avg))));
	}
	public static void main(String[] args)
	{
		Student a = new Student("Colin", 45, 60, 72);
		Student b = new Student("Ryan", 50, 90, 100);
		Student c = new Student("Jacob", 45, 60, 72);
		
		Classroom periodC = new Classroom(a, b, c);
	
		System.out.println(periodC.bestAverage());
	}
}