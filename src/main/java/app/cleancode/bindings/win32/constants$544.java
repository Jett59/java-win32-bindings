// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$544 {

    static final FunctionDescriptor QueryServiceStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceStatusEx$MH = RuntimeHelper.downcallHandle(
        "QueryServiceStatusEx",
        constants$544.QueryServiceStatusEx$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerA",
        constants$544.RegisterServiceCtrlHandlerA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerW",
        constants$544.RegisterServiceCtrlHandlerW$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExA",
        constants$544.RegisterServiceCtrlHandlerExA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExW",
        constants$544.RegisterServiceCtrlHandlerExW$FUNC
    );
    static final FunctionDescriptor SetServiceObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetServiceObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetServiceObjectSecurity",
        constants$544.SetServiceObjectSecurity$FUNC
    );
}

