module com.jwebmp.plugins.angularnyabootstrap4selector {
	exports com.jwebmp.plugins.angularnyabootstrapselector4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularnyabootstrapselector4.NyaSelectPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularnyabootstrapselector4.NyaSelectAngularModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularnyabootstrapselector4.implementations.BSNyaSelect4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularnyabootstrapselector4.implementations.BSNyaSelect4ExclusionsModule;

	opens com.jwebmp.plugins.angularnyabootstrapselector4 to com.fasterxml.jackson.databind, com.jwebmp.core;
}

