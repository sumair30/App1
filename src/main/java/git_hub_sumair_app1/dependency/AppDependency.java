package git_hub_sumair_app1.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import git_hub_sumair_app1.dependencyImpl.AppDependencyImpl;

@Service("AppDependency")
public abstract class AppDependency {
	public abstract long getLocalTime();
}
