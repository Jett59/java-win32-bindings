// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$355 {

    static final FunctionDescriptor IsWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWindow$MH = RuntimeHelper.downcallHandle(
        "IsWindow",
        constants$355.IsWindow$FUNC
    );
    static final FunctionDescriptor IsMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsMenu$MH = RuntimeHelper.downcallHandle(
        "IsMenu",
        constants$355.IsMenu$FUNC
    );
    static final FunctionDescriptor IsChild$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsChild$MH = RuntimeHelper.downcallHandle(
        "IsChild",
        constants$355.IsChild$FUNC
    );
    static final FunctionDescriptor DestroyWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyWindow$MH = RuntimeHelper.downcallHandle(
        "DestroyWindow",
        constants$355.DestroyWindow$FUNC
    );
    static final FunctionDescriptor ShowWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindow$MH = RuntimeHelper.downcallHandle(
        "ShowWindow",
        constants$355.ShowWindow$FUNC
    );
    static final FunctionDescriptor AnimateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AnimateWindow$MH = RuntimeHelper.downcallHandle(
        "AnimateWindow",
        constants$355.AnimateWindow$FUNC
    );
}


