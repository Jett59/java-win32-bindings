// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$110 {

    static final FunctionDescriptor GetAtomNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAtomNameW$MH = RuntimeHelper.downcallHandle(
        "GetAtomNameW",
        constants$110.GetAtomNameW$FUNC
    );
    static final FunctionDescriptor GetProfileIntA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileIntA$MH = RuntimeHelper.downcallHandle(
        "GetProfileIntA",
        constants$110.GetProfileIntA$FUNC
    );
    static final FunctionDescriptor GetProfileIntW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileIntW$MH = RuntimeHelper.downcallHandle(
        "GetProfileIntW",
        constants$110.GetProfileIntW$FUNC
    );
    static final FunctionDescriptor GetProfileStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileStringA$MH = RuntimeHelper.downcallHandle(
        "GetProfileStringA",
        constants$110.GetProfileStringA$FUNC
    );
    static final FunctionDescriptor GetProfileStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProfileStringW$MH = RuntimeHelper.downcallHandle(
        "GetProfileStringW",
        constants$110.GetProfileStringW$FUNC
    );
    static final FunctionDescriptor WriteProfileStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteProfileStringA$MH = RuntimeHelper.downcallHandle(
        "WriteProfileStringA",
        constants$110.WriteProfileStringA$FUNC
    );
}

