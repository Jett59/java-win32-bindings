// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$104 {

    static final FunctionDescriptor GetFirmwareEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFirmwareEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareEnvironmentVariableA",
        constants$104.GetFirmwareEnvironmentVariableA$FUNC
    );
    static final FunctionDescriptor GetFirmwareEnvironmentVariableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFirmwareEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareEnvironmentVariableW",
        constants$104.GetFirmwareEnvironmentVariableW$FUNC
    );
    static final FunctionDescriptor GetFirmwareEnvironmentVariableExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFirmwareEnvironmentVariableExA$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareEnvironmentVariableExA",
        constants$104.GetFirmwareEnvironmentVariableExA$FUNC
    );
    static final FunctionDescriptor GetFirmwareEnvironmentVariableExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFirmwareEnvironmentVariableExW$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareEnvironmentVariableExW",
        constants$104.GetFirmwareEnvironmentVariableExW$FUNC
    );
    static final FunctionDescriptor SetFirmwareEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFirmwareEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "SetFirmwareEnvironmentVariableA",
        constants$104.SetFirmwareEnvironmentVariableA$FUNC
    );
    static final FunctionDescriptor SetFirmwareEnvironmentVariableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFirmwareEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        "SetFirmwareEnvironmentVariableW",
        constants$104.SetFirmwareEnvironmentVariableW$FUNC
    );
}

