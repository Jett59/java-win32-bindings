// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor _m_prefetchw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _m_prefetchw$MH = RuntimeHelper.downcallHandle(
        "_m_prefetchw",
        constants$5._m_prefetchw$FUNC
    );
    static final FunctionDescriptor _mm_getcsr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _mm_getcsr$MH = RuntimeHelper.downcallHandle(
        "_mm_getcsr",
        constants$5._mm_getcsr$FUNC
    );
    static final FunctionDescriptor _mm_setcsr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _mm_setcsr$MH = RuntimeHelper.downcallHandle(
        "_mm_setcsr",
        constants$5._mm_setcsr$FUNC
    );
    static final FunctionDescriptor _mul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mul128$MH = RuntimeHelper.downcallHandle(
        "_mul128",
        constants$5._mul128$FUNC
    );
    static final FunctionDescriptor _umul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _umul128$MH = RuntimeHelper.downcallHandle(
        "_umul128",
        constants$5._umul128$FUNC
    );
    static final FunctionDescriptor MultiplyExtract128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle MultiplyExtract128$MH = RuntimeHelper.downcallHandle(
        "MultiplyExtract128",
        constants$5.MultiplyExtract128$FUNC
    );
}


