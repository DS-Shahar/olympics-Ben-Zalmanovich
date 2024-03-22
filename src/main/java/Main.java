

public class Grade {

	private String apparatus;
	private double score;


	public Grade(double score, String apparatus)  {

		this.apparatus=apparatus;
		this.score = score;

	}


	public String getApparatus() {
		return apparatus;
	}
	public void setApparatus(String apparatus) {
		this.apparatus = apparatus;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public void hetek(Grade x) {
		this.apparatus=x.getApparatus();	
		this.score=x.getScore();
	}




}



////////////////////////////


package Ben;

public class Athlete {

	private String name;
	private Grade [] arr;
	private int count;

	public Athlete(String name, Grade[] arr, int count) {
		this.name =name;
		this.arr=arr;
		this.count=count;
	}



	public void builtArr (String name, int count) {

		String array [] = new String[count];
	}




	public void hetek(Athlete x) {
		this.name=x.getName();	
		this.arr=x.getArr();
		this.count=x.getCount();

	}

	public boolean addGrade (String name,Grade []arr, double x ) {

		if(arr[arr.length]!=null) {

			for(int i=0; i<arr.length; i++) {

				if(arr[i]!=null) {
					arr[i].setScore(x);
					i=arr.length;
				}
			}
			return true;
		}

		return false;

	}

	public boolean deleteGrade (Grade name) {

		if(arr[arr.length]!=null) {

			for(int i=0; i<arr.length; i++) {

				if(arr[i].getApparatus()==name.getApparatus()) {
					arr[i]=null;
					i=arr.length;
				}
			}
			return true;
		}

		return false;

	}

	public int average (Grade [] arr) {
		int avg=0;
		if(arr[0]==null) {
			return -1;
		}

		for(int i=0; i<arr.length; i++) {

			avg+=arr[i].getScore();
		}
		return avg/(arr.length+1);
	}

	public boolean allGradesAbove  (double x, Grade [] arr) {

		for(int i=0; i<arr.length; i++) {

			if(arr[i].getScore()>x) {
				return false;
			}
		}
		return true;


	}


	public boolean isBetter(Athlete other) {
		Grade [] x=other.getArr();
		for(int i=0; i<arr.length; i++) {


			for(int j=0; j<arr.length; j++) {
				if(arr[i].getApparatus().equals(x[j].getApparatus())) {
					if(arr[i].getScore()>x[j].getScore()) {
						return false;
					}
				}
			}
		}
		return true;


	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade[] getArr() {
		return arr;
	}
	public void setArr(Grade[] arr) {
		this.arr = arr;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}









}
