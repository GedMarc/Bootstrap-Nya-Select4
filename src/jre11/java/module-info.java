module com.jwebmp.plugins.bs4.nyaselect {
	exports com.jwebmp.plugins.bs4.nyaselect;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.nyaselect.NyaSelectPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.bs4.nyaselect.NyaSelectAngularModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.nyaselect.implementations.BS4NyaSelectExclusionsModule;

	opens com.jwebmp.plugins.bs4.nyaselect to com.fasterxml.jackson.databind, com.jwebmp.core;
}

