// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$463 {

    static final FunctionDescriptor IsValidCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidCodePage$MH = RuntimeHelper.downcallHandle(
        "IsValidCodePage",
        constants$463.IsValidCodePage$FUNC
    );
    static final FunctionDescriptor GetACP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetACP$MH = RuntimeHelper.downcallHandle(
        "GetACP",
        constants$463.GetACP$FUNC
    );
    static final FunctionDescriptor GetOEMCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetOEMCP$MH = RuntimeHelper.downcallHandle(
        "GetOEMCP",
        constants$463.GetOEMCP$FUNC
    );
    static final FunctionDescriptor GetCPInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfo$MH = RuntimeHelper.downcallHandle(
        "GetCPInfo",
        constants$463.GetCPInfo$FUNC
    );
    static final FunctionDescriptor GetCPInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExA",
        constants$463.GetCPInfoExA$FUNC
    );
    static final FunctionDescriptor GetCPInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExW",
        constants$463.GetCPInfoExW$FUNC
    );
}


