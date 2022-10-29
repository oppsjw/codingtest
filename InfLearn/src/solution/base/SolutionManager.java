package solution.base;

public class SolutionManager {
	private static SolutionManager singleton;
	
	private static String qNoStr;
	private static String sNoStr;
	
	public static SolutionManager getInstance(String qNo, String sNo) {
		if(singleton == null) {
			singleton = new SolutionManager(qNo, sNo);
		}
		return singleton;
	}
	
	public SolutionManager(String qNo, String sNo) {
		SolutionManager.qNoStr = "q" + qNo;
		SolutionManager.sNoStr = "s" + sNo;
	}
	
	public SolutionInf getSelectedSolutionClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String packageRootPath = "solution.impl";
		String packageFullPath = packageRootPath + "." + qNoStr + "." + sNoStr;
		String className = "Solution";
		String classFullPath = packageFullPath + "." + className;
		
		return (SolutionInf) Class.forName(classFullPath).newInstance();
	}
}
