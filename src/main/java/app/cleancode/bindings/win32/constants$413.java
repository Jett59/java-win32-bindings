// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$413 {

    static final FunctionDescriptor TransmitFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TransmitFile$MH = RuntimeHelper.downcallHandle(
        "TransmitFile",
        constants$413.TransmitFile$FUNC
    );
    static final FunctionDescriptor AcceptEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AcceptEx$MH = RuntimeHelper.downcallHandle(
        "AcceptEx",
        constants$413.AcceptEx$FUNC
    );
    static final FunctionDescriptor GetAcceptExSockaddrs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAcceptExSockaddrs$MH = RuntimeHelper.downcallHandle(
        "GetAcceptExSockaddrs",
        constants$413.GetAcceptExSockaddrs$FUNC
    );
    static final FunctionDescriptor CryptAcquireContextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextA$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextA",
        constants$413.CryptAcquireContextA$FUNC
    );
    static final FunctionDescriptor CryptAcquireContextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextW$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextW",
        constants$413.CryptAcquireContextW$FUNC
    );
    static final FunctionDescriptor CryptReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptReleaseContext$MH = RuntimeHelper.downcallHandle(
        "CryptReleaseContext",
        constants$413.CryptReleaseContext$FUNC
    );
}


