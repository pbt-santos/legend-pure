// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.runtime.java.extension.store.relational.compiled.natives;

import org.eclipse.collections.api.list.ListIterable;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.runtime.java.compiled.generation.ProcessorContext;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.NativeFunctionProcessor;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.natives.AbstractNative;

public class ExecuteInDb extends AbstractNative
{
    public ExecuteInDb()
    {
        super("executeInDb_String_1__DatabaseConnection_1__Integer_1__Integer_1__ResultSet_1_");
    }

    @Override
    public String build(CoreInstance topLevelElement, CoreInstance functionExpression, ListIterable<String> transformedParams, ProcessorContext processorContext)
    {
        return "org.finos.legend.pure.generated.RelationalGen.executeInDb((String)" + transformedParams.get(0) + ", (Root_meta_relational_runtime_DatabaseConnection)" + transformedParams.get(1) + ", (Long)" + transformedParams.get(2) + ", (Long)" + transformedParams.get(3) + ", " + NativeFunctionProcessor.buildM4LineColumnSourceInformation(functionExpression.getSourceInformation()) + ", es)";
    }
}
