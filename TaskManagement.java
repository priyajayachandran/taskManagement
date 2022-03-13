
public class Users {
	private int id;
	private String fname;
	private String lname;
	private String pass;
	private String email;
}
public class UsersData { 
	private int id;
	private String fname;
	private String lname;
	private String pass;
	private String email;
}

public class Tasks {
	private int pid;
	private String pfname;
	private String ptask;
	private String pstatus;	
}

public class TasksData {
	private int pid;
	private String pfname;
	private String ptask;
	private String pstatus;
}

public class HomeController {
	public String home();
}

public class LoginController {
    	private UsersService usersService;
    
	public String login(Model model) ;
	public String main(HttpServletRequest request, Model model) ;
}

public class RegisterController {
	 private UsersService usersService;
	 
	 public String register(Model model);
	 public String aftregister(@ModelAttribute("users") Users theUsers) ;
}

public class TasksController {

	private TasksService tasksService;

	public String task(Model theModel) ;
	public String addingTask(Model model) ;
	public String addingNewTask(Model model) ;
	public String savingTask(@ModelAttribute("tasks") Tasks theTasks) ;
	public String update(@RequestParam("pid") int id, Model theModel) ;
	public String delete(@RequestParam("pid") int id);
}

public class UsersService implements UsersInf {

	public UsersRepo usersRepo;
	
	public UsersService(UsersRepo theUsersRepo);
	public List<Users> findByFirstName(String fname, String pass) ;
	public Users save(Users users);
}

public class TasksService implements TasksInf {
	 
	private TasksRepo tasksRepo;

	public List<Tasks> findAll() ;
	public void save(Tasks tasks);
	public Tasks findById(int id);
	public String delete(int id);
}
	