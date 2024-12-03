package MapPractice;

	 public class Student {

		String studentName;
		int studentId;
		int studentMarks;

		public Student(String studentName, int studentId,int studentMarks) {
			this.studentName=studentName;
			this.studentId=studentId;
			this.studentMarks=studentMarks;


		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public int getStudentMarks() {
			return studentMarks;
		}

		public void setStudentMarks(int studentMarks) {
			this.studentMarks = studentMarks;
		}

		@Override
		public String toString() {
			return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentMarks=" + studentMarks
					+ "]";
		}

	}

