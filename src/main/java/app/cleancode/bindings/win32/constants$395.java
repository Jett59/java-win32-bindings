// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$395 {

    static final FunctionDescriptor InitiateSystemShutdownExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitiateSystemShutdownExA$MH = RuntimeHelper.downcallHandle(
        "InitiateSystemShutdownExA",
        constants$395.InitiateSystemShutdownExA$FUNC
    );
    static final FunctionDescriptor InitiateSystemShutdownExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitiateSystemShutdownExW$MH = RuntimeHelper.downcallHandle(
        "InitiateSystemShutdownExW",
        constants$395.InitiateSystemShutdownExW$FUNC
    );
    static final FunctionDescriptor InitiateShutdownA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitiateShutdownA$MH = RuntimeHelper.downcallHandle(
        "InitiateShutdownA",
        constants$395.InitiateShutdownA$FUNC
    );
    static final FunctionDescriptor InitiateShutdownW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitiateShutdownW$MH = RuntimeHelper.downcallHandle(
        "InitiateShutdownW",
        constants$395.InitiateShutdownW$FUNC
    );
    static final FunctionDescriptor CheckForHiberboot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle CheckForHiberboot$MH = RuntimeHelper.downcallHandle(
        "CheckForHiberboot",
        constants$395.CheckForHiberboot$FUNC
    );
    static final FunctionDescriptor RegSaveKeyExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegSaveKeyExA$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyExA",
        constants$395.RegSaveKeyExA$FUNC
    );
}


