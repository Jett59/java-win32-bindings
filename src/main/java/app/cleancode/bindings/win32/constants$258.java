// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$258 {

    static final FunctionDescriptor CreateSymbolicLinkA$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkA$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkA",
        constants$258.CreateSymbolicLinkA$FUNC
    );
    static final FunctionDescriptor CreateSymbolicLinkW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkW$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkW",
        constants$258.CreateSymbolicLinkW$FUNC
    );
    static final FunctionDescriptor QueryActCtxSettingsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryActCtxSettingsW$MH = RuntimeHelper.downcallHandle(
        "QueryActCtxSettingsW",
        constants$258.QueryActCtxSettingsW$FUNC
    );
    static final FunctionDescriptor CreateSymbolicLinkTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkTransactedA$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkTransactedA",
        constants$258.CreateSymbolicLinkTransactedA$FUNC
    );
    static final FunctionDescriptor CreateSymbolicLinkTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkTransactedW$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkTransactedW",
        constants$258.CreateSymbolicLinkTransactedW$FUNC
    );
    static final FunctionDescriptor ReplacePartitionUnit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReplacePartitionUnit$MH = RuntimeHelper.downcallHandle(
        "ReplacePartitionUnit",
        constants$258.ReplacePartitionUnit$FUNC
    );
}


