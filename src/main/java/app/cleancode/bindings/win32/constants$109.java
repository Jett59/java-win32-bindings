// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$109 {

    static final FunctionDescriptor GlobalGetAtomNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalGetAtomNameW$MH = RuntimeHelper.downcallHandle(
        "GlobalGetAtomNameW",
        constants$109.GlobalGetAtomNameW$FUNC
    );
    static final FunctionDescriptor AddAtomA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddAtomA$MH = RuntimeHelper.downcallHandle(
        "AddAtomA",
        constants$109.AddAtomA$FUNC
    );
    static final FunctionDescriptor AddAtomW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddAtomW$MH = RuntimeHelper.downcallHandle(
        "AddAtomW",
        constants$109.AddAtomW$FUNC
    );
    static final FunctionDescriptor FindAtomA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindAtomA$MH = RuntimeHelper.downcallHandle(
        "FindAtomA",
        constants$109.FindAtomA$FUNC
    );
    static final FunctionDescriptor FindAtomW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindAtomW$MH = RuntimeHelper.downcallHandle(
        "FindAtomW",
        constants$109.FindAtomW$FUNC
    );
    static final FunctionDescriptor GetAtomNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAtomNameA$MH = RuntimeHelper.downcallHandle(
        "GetAtomNameA",
        constants$109.GetAtomNameA$FUNC
    );
}

