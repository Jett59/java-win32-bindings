// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$26 {

    static final  GroupLayout GUID_HIBERNATE_FASTS4_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_HIBERNATE_FASTS4_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_HIBERNATE_FASTS4_POLICY", constants$26.GUID_HIBERNATE_FASTS4_POLICY$LAYOUT);
    static final  GroupLayout GUID_CRITICAL_POWER_TRANSITION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_CRITICAL_POWER_TRANSITION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_CRITICAL_POWER_TRANSITION", constants$26.GUID_CRITICAL_POWER_TRANSITION$LAYOUT);
    static final  GroupLayout GUID_SYSTEM_AWAYMODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SYSTEM_AWAYMODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SYSTEM_AWAYMODE", constants$26.GUID_SYSTEM_AWAYMODE$LAYOUT);
    static final  GroupLayout GUID_ALLOW_AWAYMODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_AWAYMODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ALLOW_AWAYMODE", constants$26.GUID_ALLOW_AWAYMODE$LAYOUT);
    static final  GroupLayout GUID_USER_PRESENCE_PREDICTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_USER_PRESENCE_PREDICTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_USER_PRESENCE_PREDICTION", constants$26.GUID_USER_PRESENCE_PREDICTION$LAYOUT);
    static final  GroupLayout GUID_STANDBY_BUDGET_GRACE_PERIOD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_BUDGET_GRACE_PERIOD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_BUDGET_GRACE_PERIOD", constants$26.GUID_STANDBY_BUDGET_GRACE_PERIOD$LAYOUT);
}


