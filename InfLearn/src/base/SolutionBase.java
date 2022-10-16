package base;

public class SolutionBase {
	private Class<?> klass;
	public Class<?> getKlass() {
		return klass;
	}
	public void setKlass(Class<?> klass) {
		this.klass = klass;
	}
	
	public SolutionBase(String probNo) throws ClassNotFoundException {
		String[] splitProbNo = probNo.split("-");		
		String classFullPath = this.getSelectedPackageName(this.getStrProbQuarter(splitProbNo[0]), this.getStrProbSolution(splitProbNo[1]));
		this.setKlass(Class.forName(classFullPath).getClass());
	}
	
	private String getStrProbQuarter(String quarterNO) {
		return "q" + quarterNO;
	}
	private String getStrProbSolution(String solutionNO) {
		return "s" + solutionNO;
	}
	private String getSelectedPackageName(String quarterNO, String solutionNO) {
		return "solution." + quarterNO + "." + solutionNO + ".Solution";
	}
}
