// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$130 {

    static final FunctionDescriptor GetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExA",
        constants$130.GetComputerNameExA$FUNC
    );
    static final FunctionDescriptor GetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExW",
        constants$130.GetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExW",
        constants$130.SetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSystemTime$MH = RuntimeHelper.downcallHandle(
        "SetSystemTime",
        constants$130.SetSystemTime$FUNC
    );
    static final FunctionDescriptor GetVersionExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVersionExA$MH = RuntimeHelper.downcallHandle(
        "GetVersionExA",
        constants$130.GetVersionExA$FUNC
    );
    static final FunctionDescriptor GetVersionExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVersionExW$MH = RuntimeHelper.downcallHandle(
        "GetVersionExW",
        constants$130.GetVersionExW$FUNC
    );
}


