// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$203 {

    static final FunctionDescriptor SetWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "SetWorldTransform",
        constants$203.SetWorldTransform$FUNC
    );
    static final FunctionDescriptor ModifyWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ModifyWorldTransform$MH = RuntimeHelper.downcallHandle(
        "ModifyWorldTransform",
        constants$203.ModifyWorldTransform$FUNC
    );
    static final FunctionDescriptor CombineTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CombineTransform$MH = RuntimeHelper.downcallHandle(
        "CombineTransform",
        constants$203.CombineTransform$FUNC
    );
    static final FunctionDescriptor CreateDIBSection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateDIBSection$MH = RuntimeHelper.downcallHandle(
        "CreateDIBSection",
        constants$203.CreateDIBSection$FUNC
    );
    static final FunctionDescriptor GetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "GetDIBColorTable",
        constants$203.GetDIBColorTable$FUNC
    );
    static final FunctionDescriptor SetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "SetDIBColorTable",
        constants$203.SetDIBColorTable$FUNC
    );
}


