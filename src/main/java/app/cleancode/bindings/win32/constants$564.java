// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$564 {

    static final FunctionDescriptor WSAAsyncGetProtoByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByName",
        constants$564.WSAAsyncGetProtoByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetProtoByNumber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetProtoByNumber$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetProtoByNumber",
        constants$564.WSAAsyncGetProtoByNumber$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByName$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByName",
        constants$564.WSAAsyncGetHostByName$FUNC
    );
    static final FunctionDescriptor WSAAsyncGetHostByAddr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncGetHostByAddr$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncGetHostByAddr",
        constants$564.WSAAsyncGetHostByAddr$FUNC
    );
    static final FunctionDescriptor WSACancelAsyncRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSACancelAsyncRequest$MH = RuntimeHelper.downcallHandle(
        "WSACancelAsyncRequest",
        constants$564.WSACancelAsyncRequest$FUNC
    );
    static final FunctionDescriptor WSAAsyncSelect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAAsyncSelect$MH = RuntimeHelper.downcallHandle(
        "WSAAsyncSelect",
        constants$564.WSAAsyncSelect$FUNC
    );
}


