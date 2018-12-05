package com.lightbend.play.tools.routes;

import com.lightbend.play.tools.PlayCompileSpec;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;

public interface RoutesCompileSpec extends PlayCompileSpec, Serializable {
    Iterable<File> getSources();

    boolean isJavaProject();

    boolean isNamespaceReverseRouter();

    boolean isGenerateReverseRoutes();

    boolean isInjectedRoutesGenerator();

    Collection<String> getAdditionalImports();
}