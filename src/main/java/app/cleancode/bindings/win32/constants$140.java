// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$140 {

    static final FunctionDescriptor CreateProcessWithLogonW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessWithLogonW$MH = RuntimeHelper.downcallHandle(
        "CreateProcessWithLogonW",
        constants$140.CreateProcessWithLogonW$FUNC
    );
    static final FunctionDescriptor CreateProcessWithTokenW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessWithTokenW$MH = RuntimeHelper.downcallHandle(
        "CreateProcessWithTokenW",
        constants$140.CreateProcessWithTokenW$FUNC
    );
    static final FunctionDescriptor IsTokenUntrusted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTokenUntrusted$MH = RuntimeHelper.downcallHandle(
        "IsTokenUntrusted",
        constants$140.IsTokenUntrusted$FUNC
    );
    static final FunctionDescriptor RegisterWaitForSingleObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterWaitForSingleObject$MH = RuntimeHelper.downcallHandle(
        "RegisterWaitForSingleObject",
        constants$140.RegisterWaitForSingleObject$FUNC
    );
    static final FunctionDescriptor UnregisterWait$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWait$MH = RuntimeHelper.downcallHandle(
        "UnregisterWait",
        constants$140.UnregisterWait$FUNC
    );
    static final FunctionDescriptor BindIoCompletionCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BindIoCompletionCallback$MH = RuntimeHelper.downcallHandle(
        "BindIoCompletionCallback",
        constants$140.BindIoCompletionCallback$FUNC
    );
}

