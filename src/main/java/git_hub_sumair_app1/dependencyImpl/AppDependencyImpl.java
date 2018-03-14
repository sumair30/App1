package git_hub_sumair_app1.dependencyImpl;

import java.util.Date;

import org.springframework.stereotype.Service;

import git_hub_sumair_app1.dependency.AppDependency;

@Service("AppDependencyImpl")
public class AppDependencyImpl extends AppDependency {

	@Override
	public long getLocalTime() {
		Date date = new Date();
		return date.getTime();
	}
	
}
