// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$87 {

    static final FunctionDescriptor GetTempPathA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTempPathA$MH = RuntimeHelper.downcallHandle(
        "GetTempPathA",
        constants$87.GetTempPathA$FUNC
    );
    static final FunctionDescriptor FindFirstFileNameW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileNameW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileNameW",
        constants$87.FindFirstFileNameW$FUNC
    );
    static final FunctionDescriptor FindNextFileNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextFileNameW$MH = RuntimeHelper.downcallHandle(
        "FindNextFileNameW",
        constants$87.FindNextFileNameW$FUNC
    );
    static final FunctionDescriptor GetVolumeInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumeInformationA$MH = RuntimeHelper.downcallHandle(
        "GetVolumeInformationA",
        constants$87.GetVolumeInformationA$FUNC
    );
    static final FunctionDescriptor GetTempFileNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTempFileNameA$MH = RuntimeHelper.downcallHandle(
        "GetTempFileNameA",
        constants$87.GetTempFileNameA$FUNC
    );
    static final FunctionDescriptor SetFileApisToOEM$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle SetFileApisToOEM$MH = RuntimeHelper.downcallHandle(
        "SetFileApisToOEM",
        constants$87.SetFileApisToOEM$FUNC
    );
}


