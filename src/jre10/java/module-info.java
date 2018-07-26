import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularnyabootstrapselector.NyaSelectAngularModule;
import com.jwebmp.plugins.angularnyabootstrapselector.NysSelectBootstrapConfigurator;

module com.jwebmp.plugins.angularnyabootstrapselector {
	exports com.jwebmp.plugins.angularnyabootstrapselector;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap4;

	provides IPageConfigurator with NysSelectBootstrapConfigurator;
	provides IAngularModule with NyaSelectAngularModule;

	opens com.jwebmp.plugins.angularnyabootstrapselector to com.fasterxml.jackson.databind,com.jwebmp.core;
}
