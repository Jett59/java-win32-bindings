// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$181 {

    static final FunctionDescriptor GetTextColor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextColor$MH = RuntimeHelper.downcallHandle(
        "GetTextColor",
        constants$181.GetTextColor$FUNC
    );
    static final FunctionDescriptor GetTextExtentPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentPointA$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentPointA",
        constants$181.GetTextExtentPointA$FUNC
    );
    static final FunctionDescriptor GetTextExtentPointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentPointW$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentPointW",
        constants$181.GetTextExtentPointW$FUNC
    );
    static final FunctionDescriptor GetTextExtentPoint32A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentPoint32A$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentPoint32A",
        constants$181.GetTextExtentPoint32A$FUNC
    );
    static final FunctionDescriptor GetTextExtentPoint32W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentPoint32W$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentPoint32W",
        constants$181.GetTextExtentPoint32W$FUNC
    );
    static final FunctionDescriptor GetTextExtentExPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentExPointA$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentExPointA",
        constants$181.GetTextExtentExPointA$FUNC
    );
}

