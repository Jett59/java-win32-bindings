// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$558 {

    static final FunctionDescriptor ioctlsocket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ioctlsocket$MH = RuntimeHelper.downcallHandle(
        "ioctlsocket",
        constants$558.ioctlsocket$FUNC
    );
    static final FunctionDescriptor getpeername$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getpeername$MH = RuntimeHelper.downcallHandle(
        "getpeername",
        constants$558.getpeername$FUNC
    );
    static final FunctionDescriptor getsockname$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsockname$MH = RuntimeHelper.downcallHandle(
        "getsockname",
        constants$558.getsockname$FUNC
    );
    static final FunctionDescriptor getsockopt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsockopt$MH = RuntimeHelper.downcallHandle(
        "getsockopt",
        constants$558.getsockopt$FUNC
    );
    static final FunctionDescriptor htonl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle htonl$MH = RuntimeHelper.downcallHandle(
        "htonl",
        constants$558.htonl$FUNC
    );
    static final FunctionDescriptor htons$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle htons$MH = RuntimeHelper.downcallHandle(
        "htons",
        constants$558.htons$FUNC
    );
}


