// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$12 {

    static final FunctionDescriptor WriteRaw64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw64$MH = RuntimeHelper.downcallHandle(
        "WriteRaw64",
        constants$12.WriteRaw64$FUNC
    );
    static final FunctionDescriptor ReadUCharAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadUCharAcquire",
        constants$12.ReadUCharAcquire$FUNC
    );
    static final FunctionDescriptor ReadUCharNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadUCharNoFence",
        constants$12.ReadUCharNoFence$FUNC
    );
    static final FunctionDescriptor ReadBooleanAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanAcquire",
        constants$12.ReadBooleanAcquire$FUNC
    );
    static final FunctionDescriptor ReadBooleanNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanNoFence",
        constants$12.ReadBooleanNoFence$FUNC
    );
    static final FunctionDescriptor ReadUCharRaw$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharRaw$MH = RuntimeHelper.downcallHandle(
        "ReadUCharRaw",
        constants$12.ReadUCharRaw$FUNC
    );
}


