// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$201 {

    static final FunctionDescriptor _lcreat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lcreat$MH = RuntimeHelper.downcallHandle(
        "_lcreat",
        constants$201._lcreat$FUNC
    );
    static final FunctionDescriptor _lread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lread$MH = RuntimeHelper.downcallHandle(
        "_lread",
        constants$201._lread$FUNC
    );
    static final FunctionDescriptor _lwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lwrite$MH = RuntimeHelper.downcallHandle(
        "_lwrite",
        constants$201._lwrite$FUNC
    );
    static final FunctionDescriptor _hread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _hread$MH = RuntimeHelper.downcallHandle(
        "_hread",
        constants$201._hread$FUNC
    );
    static final FunctionDescriptor _hwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _hwrite$MH = RuntimeHelper.downcallHandle(
        "_hwrite",
        constants$201._hwrite$FUNC
    );
    static final FunctionDescriptor _lclose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lclose$MH = RuntimeHelper.downcallHandle(
        "_lclose",
        constants$201._lclose$FUNC
    );
}


