// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$245 {

    static final FunctionDescriptor GetCurrentHwProfileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentHwProfileW$MH = RuntimeHelper.downcallHandle(
        "GetCurrentHwProfileW",
        constants$245.GetCurrentHwProfileW$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoA$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoA",
        constants$245.VerifyVersionInfoA$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoW$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoW",
        constants$245.VerifyVersionInfoW$FUNC
    );
    static final FunctionDescriptor HRESULT_FROM_WIN32$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HRESULT_FROM_WIN32$MH = RuntimeHelper.downcallHandle(
        "HRESULT_FROM_WIN32",
        constants$245.HRESULT_FROM_WIN32$FUNC
    );
    static final FunctionDescriptor SystemTimeToTzSpecificLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTime",
        constants$245.SystemTimeToTzSpecificLocalTime$FUNC
    );
    static final FunctionDescriptor TzSpecificLocalTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTime",
        constants$245.TzSpecificLocalTimeToSystemTime$FUNC
    );
}


