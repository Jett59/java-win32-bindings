// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$270 {

    static final FunctionDescriptor IsCharUpperW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle IsCharUpperW$MH = RuntimeHelper.downcallHandle(
        "IsCharUpperW",
        constants$270.IsCharUpperW$FUNC
    );
    static final FunctionDescriptor IsCharLowerA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsCharLowerA$MH = RuntimeHelper.downcallHandle(
        "IsCharLowerA",
        constants$270.IsCharLowerA$FUNC
    );
    static final FunctionDescriptor IsCharLowerW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle IsCharLowerW$MH = RuntimeHelper.downcallHandle(
        "IsCharLowerW",
        constants$270.IsCharLowerW$FUNC
    );
    static final FunctionDescriptor SetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFocus$MH = RuntimeHelper.downcallHandle(
        "SetFocus",
        constants$270.SetFocus$FUNC
    );
    static final FunctionDescriptor GetActiveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetActiveWindow$MH = RuntimeHelper.downcallHandle(
        "GetActiveWindow",
        constants$270.GetActiveWindow$FUNC
    );
    static final FunctionDescriptor GetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFocus$MH = RuntimeHelper.downcallHandle(
        "GetFocus",
        constants$270.GetFocus$FUNC
    );
}

