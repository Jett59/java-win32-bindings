// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$239 {

    static final FunctionDescriptor GetDefaultCommConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDefaultCommConfigA$MH = RuntimeHelper.downcallHandle(
        "GetDefaultCommConfigA",
        constants$239.GetDefaultCommConfigA$FUNC
    );
    static final FunctionDescriptor GetDefaultCommConfigW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDefaultCommConfigW$MH = RuntimeHelper.downcallHandle(
        "GetDefaultCommConfigW",
        constants$239.GetDefaultCommConfigW$FUNC
    );
    static final FunctionDescriptor SetDefaultCommConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultCommConfigA$MH = RuntimeHelper.downcallHandle(
        "SetDefaultCommConfigA",
        constants$239.SetDefaultCommConfigA$FUNC
    );
    static final FunctionDescriptor SetDefaultCommConfigW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultCommConfigW$MH = RuntimeHelper.downcallHandle(
        "SetDefaultCommConfigW",
        constants$239.SetDefaultCommConfigW$FUNC
    );
    static final FunctionDescriptor GetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameA",
        constants$239.GetComputerNameA$FUNC
    );
    static final FunctionDescriptor GetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameW",
        constants$239.GetComputerNameW$FUNC
    );
}


