// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$115 {

    static final FunctionDescriptor TerminateThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateThread$MH = RuntimeHelper.downcallHandle(
        "TerminateThread",
        constants$115.TerminateThread$FUNC
    );
    static final FunctionDescriptor GetExitCodeThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExitCodeThread$MH = RuntimeHelper.downcallHandle(
        "GetExitCodeThread",
        constants$115.GetExitCodeThread$FUNC
    );
    static final FunctionDescriptor SuspendThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SuspendThread$MH = RuntimeHelper.downcallHandle(
        "SuspendThread",
        constants$115.SuspendThread$FUNC
    );
    static final FunctionDescriptor ResumeThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResumeThread$MH = RuntimeHelper.downcallHandle(
        "ResumeThread",
        constants$115.ResumeThread$FUNC
    );
    static final FunctionDescriptor TlsAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle TlsAlloc$MH = RuntimeHelper.downcallHandle(
        "TlsAlloc",
        constants$115.TlsAlloc$FUNC
    );
    static final FunctionDescriptor TlsGetValue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TlsGetValue$MH = RuntimeHelper.downcallHandle(
        "TlsGetValue",
        constants$115.TlsGetValue$FUNC
    );
}


