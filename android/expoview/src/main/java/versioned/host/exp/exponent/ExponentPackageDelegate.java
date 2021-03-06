package versioned.host.exp.exponent;

import java.util.List;

import expo.core.interfaces.Package;
import expo.core.interfaces.SingletonModule;
import versioned.host.exp.exponent.modules.universal.ExpoModuleRegistryAdapter;

public interface ExponentPackageDelegate {
  ExpoModuleRegistryAdapter getScopedModuleRegistryAdapterForPackages(List<Package> packages, List<SingletonModule> singletonModules);
}
