// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$141 {

    static final FunctionDescriptor PBAD_MEMORY_CALLBACK_ROUTINE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PBAD_MEMORY_CALLBACK_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$141.PBAD_MEMORY_CALLBACK_ROUTINE$FUNC
    );
    static final FunctionDescriptor RegisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterBadMemoryNotification",
        constants$141.RegisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor UnregisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterBadMemoryNotification",
        constants$141.UnregisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor OfferVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OfferVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "OfferVirtualMemory",
        constants$141.OfferVirtualMemory$FUNC
    );
    static final FunctionDescriptor ReclaimVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ReclaimVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "ReclaimVirtualMemory",
        constants$141.ReclaimVirtualMemory$FUNC
    );
}


