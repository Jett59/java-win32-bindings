// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor _rotr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _rotr$MH = RuntimeHelper.downcallHandle(
        "_rotr",
        constants$1._rotr$FUNC
    );
    static final FunctionDescriptor _rotr64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _rotr64$MH = RuntimeHelper.downcallHandle(
        "_rotr64",
        constants$1._rotr64$FUNC
    );
    static final FunctionDescriptor EXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$1.EXCEPTION_ROUTINE$FUNC
    );
    static final FunctionDescriptor PEXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PEXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$1.PEXCEPTION_ROUTINE$FUNC
    );
}

