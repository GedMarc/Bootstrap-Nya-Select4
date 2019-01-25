import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularnyabootstrapselector4.NyaSelectAngularModule;
import com.jwebmp.plugins.angularnyabootstrapselector4.NyaSelectPageConfigurator;
import com.jwebmp.plugins.angularnyabootstrapselector4.implementations.BSNyaSelect4ExclusionsModule;

module com.jwebmp.plugins.angularnyabootstrap4selector {
	exports com.jwebmp.plugins.angularnyabootstrapselector;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with NyaSelectPageConfigurator;
	provides IAngularModule with NyaSelectAngularModule;

	provides IGuiceScanModuleExclusions with BSNyaSelect4ExclusionsModule;
	provides IGuiceScanJarExclusions with BSNyaSelect4ExclusionsModule;

	opens com.jwebmp.plugins.angularnyabootstrapselector to com.fasterxml.jackson.databind, com.jwebmp.core;
}
