// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor PIMAGE_TLS_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PIMAGE_TLS_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$54.PIMAGE_TLS_CALLBACK$FUNC
    );
    static final FunctionDescriptor RtlCaptureStackBackTrace$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlCaptureStackBackTrace$MH = RuntimeHelper.downcallHandle(
        "RtlCaptureStackBackTrace",
        constants$54.RtlCaptureStackBackTrace$FUNC
    );
    static final FunctionDescriptor RtlCaptureContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlCaptureContext$MH = RuntimeHelper.downcallHandle(
        "RtlCaptureContext",
        constants$54.RtlCaptureContext$FUNC
    );
    static final FunctionDescriptor RtlCaptureContext2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlCaptureContext2$MH = RuntimeHelper.downcallHandle(
        "RtlCaptureContext2",
        constants$54.RtlCaptureContext2$FUNC
    );
    static final FunctionDescriptor RtlUnwind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlUnwind$MH = RuntimeHelper.downcallHandle(
        "RtlUnwind",
        constants$54.RtlUnwind$FUNC
    );
    static final FunctionDescriptor RtlAddFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlAddFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlAddFunctionTable",
        constants$54.RtlAddFunctionTable$FUNC
    );
}

