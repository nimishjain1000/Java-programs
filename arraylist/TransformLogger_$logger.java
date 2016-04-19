
package org.jboss.logging.processor.generated;
 
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.Logger;
 
 
/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2012-10-30T14:01:05-0700")
public class TransformLogger_$logger
    implements Serializable, TransformLogger
{
 
    private final static long serialVersionUID = 1L;
    private final static java.lang.String FQCN = TransformLogger_$logger.class.getName();
    protected final Logger log;
    private final static java.lang.String logSize = "size: %d";
    private final static java.lang.String logObjectHashCode = "hashCode: %d";
    private final static java.lang.String logObjectIdentityHashCode = "SystemIdentity: %d";
    private final static java.lang.String logClassIdentityHashCode = "SystemIdentity: %d";
    private final static java.lang.String logClassHashCode = "hashCode: %d";
    private final static java.lang.String logObjectClass = "getClass: %s";
 
    public TransformLogger_$logger(final Logger log) {
        this.log = log;
    }
 
    public final void logSize(java.lang.String... array) {
        int arraySize;
        if (array == null) {
            arraySize = 0;
        } else {
            arraySize = array.length;
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logSize$str(), arraySize);
    }
 
    protected java.lang.String logSize$str() {
        return logSize;
    }
 
    public final void logObjectHashCode(final java.lang.Object[] array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.util.Arrays.hashCode(array);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectHashCode$str(), arrayHashCode);
    }
 
    protected java.lang.String logObjectHashCode$str() {
        return logObjectHashCode;
    }
 
    public final void logObjectIdentityHashCode(final java.util.Map map) {
        int mapHashCode;
        if (map == null) {
            mapHashCode = 0;
        } else {
            mapHashCode = java.lang.System.identityHashCode(map);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectIdentityHashCode$str(), mapHashCode);
    }
 
    protected java.lang.String logObjectIdentityHashCode$str() {
        return logObjectIdentityHashCode;
    }
 
    public final void logClassIdentityHashCode(final java.lang.String s) {
        int sHashCode;
        if (s == null) {
            sHashCode = 0;
        } else {
            sHashCode = java.lang.System.identityHashCode(s.getClass());
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassIdentityHashCode$str(), sHashCode);
    }
 
    protected java.lang.String logClassIdentityHashCode$str() {
        return logClassIdentityHashCode;
    }
 
    public final void logObjectHashCode(final java.util.Collection c) {
        int cHashCode;
        if (c == null) {
            cHashCode = 0;
        } else {
            cHashCode = c.hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectHashCode$str(), cHashCode);
    }
 
    public final void logClassHashCode(final java.lang.Object[] array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = array.getClass().hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassHashCode$str(), arrayHashCode);
    }
 
    protected java.lang.String logClassHashCode$str() {
        return logClassHashCode;
    }
 
    public final void logObjectIdentityHashCode(java.lang.String... array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.lang.System.identityHashCode(array);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectIdentityHashCode$str(), arrayHashCode);
    }
 
    public final void logClassIdentityHashCode(final java.lang.Object[] array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.lang.System.identityHashCode(array.getClass());
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassIdentityHashCode$str(), arrayHashCode);
    }
 
    public final void logObjectIdentityHashCode(final java.lang.String s) {
        int sHashCode;
        if (s == null) {
            sHashCode = 0;
        } else {
            sHashCode = java.lang.System.identityHashCode(s);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectIdentityHashCode$str(), sHashCode);
    }
 
    public final void logClassHashCode(final java.util.Map map) {
        int mapHashCode;
        if (map == null) {
            mapHashCode = 0;
        } else {
            mapHashCode = map.getClass().hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassHashCode$str(), mapHashCode);
    }
 
    public final void logObjectHashCode(final java.lang.String s) {
        int sHashCode;
        if (s == null) {
            sHashCode = 0;
        } else {
            sHashCode = s.hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectHashCode$str(), sHashCode);
    }
 
    public final void logClassIdentityHashCode(final java.util.Map map) {
        int mapHashCode;
        if (map == null) {
            mapHashCode = 0;
        } else {
            mapHashCode = java.lang.System.identityHashCode(map.getClass());
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassIdentityHashCode$str(), mapHashCode);
    }
 
    public final void logObjectHashCode(java.lang.String... array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.util.Arrays.hashCode(array);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectHashCode$str(), arrayHashCode);
    }
 
    public final void logObjectIdentityHashCode(final java.util.Collection c) {
        int cHashCode;
        if (c == null) {
            cHashCode = 0;
        } else {
            cHashCode = java.lang.System.identityHashCode(c);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectIdentityHashCode$str(), cHashCode);
    }
 
    public final void logObjectClass(final java.lang.String s) {
        java.lang.Class sClass;
        if (s == null) {
            sClass = null;
        } else {
            sClass = s.getClass();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectClass$str(), sClass);
    }
 
    protected java.lang.String logObjectClass$str() {
        return logObjectClass;
    }
 
    public final void logSize(final java.util.Collection c) {
        int cSize;
        if (c == null) {
            cSize = 0;
        } else {
            cSize = c.size();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logSize$str(), cSize);
    }
 
    public final void logClassIdentityHashCode(java.lang.String... array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.lang.System.identityHashCode(array.getClass());
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassIdentityHashCode$str(), arrayHashCode);
    }
 
    public final void logObjectHashCode(final java.util.Map map) {
        int mapHashCode;
        if (map == null) {
            mapHashCode = 0;
        } else {
            mapHashCode = map.hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectHashCode$str(), mapHashCode);
    }
 
    public final void logSize(final java.util.Map map) {
        int mapSize;
        if (map == null) {
            mapSize = 0;
        } else {
            mapSize = map.size();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logSize$str(), mapSize);
    }
 
    public final void logClassHashCode(final java.lang.String s) {
        int sHashCode;
        if (s == null) {
            sHashCode = 0;
        } else {
            sHashCode = s.getClass().hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassHashCode$str(), sHashCode);
    }
 
    public final void logObjectClass(final java.lang.Object[] array) {
        java.lang.Class arrayClass;
        if (array == null) {
            arrayClass = null;
        } else {
            arrayClass = array.getClass();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectClass$str(), arrayClass);
    }
 
    public final void logClassHashCode(final java.util.Collection c) {
        int cHashCode;
        if (c == null) {
            cHashCode = 0;
        } else {
            cHashCode = c.getClass().hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassHashCode$str(), cHashCode);
    }
 
    public final void logSize(final java.lang.Object[] array) {
        int arraySize;
        if (array == null) {
            arraySize = 0;
        } else {
            arraySize = array.length;
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logSize$str(), arraySize);
    }
 
    public final void logObjectClass(java.lang.String... array) {
        java.lang.Class arrayClass;
        if (array == null) {
            arrayClass = null;
        } else {
            arrayClass = array.getClass();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectClass$str(), arrayClass);
    }
 
    public final void logClassIdentityHashCode(final java.util.Collection c) {
        int cHashCode;
        if (c == null) {
            cHashCode = 0;
        } else {
            cHashCode = java.lang.System.identityHashCode(c.getClass());
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassIdentityHashCode$str(), cHashCode);
    }
 
    public final void logClassHashCode(java.lang.String... array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = array.getClass().hashCode();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logClassHashCode$str(), arrayHashCode);
    }
 
    public final void logSize(final java.lang.String s) {
        int sSize;
        if (s == null) {
            sSize = 0;
        } else {
            sSize = s.length();
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logSize$str(), sSize);
    }
 
    public final void logObjectIdentityHashCode(final java.lang.Object[] array) {
        int arrayHashCode;
        if (array == null) {
            arrayHashCode = 0;
        } else {
            arrayHashCode = java.lang.System.identityHashCode(array);
        }
        log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logObjectIdentityHashCode$str(), arrayHashCode);
    }
 
}