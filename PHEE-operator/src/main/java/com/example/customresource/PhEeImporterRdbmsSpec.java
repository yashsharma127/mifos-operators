package com.example.customresource;

import java.util.Objects;

public class PhEeImporterRdbmsSpec {
    private Boolean enabled;
    private Integer replicas;
    private String image;
    private String springProfilesActive;
    private Datasource datasource;
    private Resources resources;
    private Logging logging;
    private String javaToolOptions;
    private String bucketName;
    private Probe livenessProbe;
    private Probe readinessProbe;
    private Boolean rbacEnabled;
    private Boolean secretEnabled;
    private Boolean configMapEnabled;
    private Boolean ingressEnabled;

    public PhEeImporterRdbmsSpec() {
    }

    public PhEeImporterRdbmsSpec(Boolean enabled, Integer replicas, String image, String springProfilesActive,
                                 Datasource datasource, Resources resources, Logging logging,
                                 String javaToolOptions, String bucketName,
                                 Probe livenessProbe, Probe readinessProbe,
                                 Boolean rbacEnabled, Boolean secretEnabled,
                                 Boolean configMapEnabled, Boolean ingressEnabled) {
        this.enabled = enabled;
        this.replicas = replicas;
        this.image = image;
        this.springProfilesActive = springProfilesActive;
        this.datasource = datasource;
        this.resources = resources;
        this.logging = logging;
        this.javaToolOptions = javaToolOptions;
        this.bucketName = bucketName;
        this.livenessProbe = livenessProbe;
        this.readinessProbe = readinessProbe;
        this.rbacEnabled = rbacEnabled;
        this.secretEnabled = secretEnabled;
        this.configMapEnabled = configMapEnabled;
        this.ingressEnabled = ingressEnabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSpringProfilesActive() {
        return springProfilesActive;
    }

    public void setSpringProfilesActive(String springProfilesActive) {
        this.springProfilesActive = springProfilesActive;
    }

    public Datasource getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Logging getLogging() {
        return logging;
    }

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    public String getJavaToolOptions() {
        return javaToolOptions;
    }

    public void setJavaToolOptions(String javaToolOptions) {
        this.javaToolOptions = javaToolOptions;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public Boolean getrbacEnabled() {
        return rbacEnabled;
    }

    public void setrbacEnabled(Boolean rbacEnabled) {
        this.rbacEnabled = rbacEnabled;
    }

    public Boolean getsecretEnabled() {
        return secretEnabled;
    }

    public void setsecretEnabled(Boolean secretEnabled) {
        this.secretEnabled = secretEnabled;
    }

    public Boolean getconfigMapEnabled() {
        return configMapEnabled;
    }

    public void setconfigMapEnabled(Boolean configMapEnabled) {
        this.configMapEnabled = configMapEnabled;
    }

    public Boolean getingressEnabled() {
        return ingressEnabled;
    }

    public void setingressEnabled(Boolean ingressEnabled) {
        this.ingressEnabled = ingressEnabled;
    }

    @Override
    public String toString() {
        return "PhEeImporterRdbmsSpec{" +
                "enabled=" + enabled +
                "replicas=" + replicas +
                ", image='" + image + '\'' +
                ", springProfilesActive='" + springProfilesActive + '\'' +
                ", datasource=" + datasource +
                ", resources=" + resources +
                ", logging=" + logging +
                ", javaToolOptions='" + javaToolOptions + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", livenessProbe=" + livenessProbe +
                ", readinessProbe=" + readinessProbe +
                ", rbacEnabled=" + rbacEnabled +
                ", secretEnabled=" + secretEnabled +
                ", configMapEnabled=" + configMapEnabled +
                ", ingressEnabled=" + ingressEnabled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhEeImporterRdbmsSpec)) return false;
        PhEeImporterRdbmsSpec that = (PhEeImporterRdbmsSpec) o;
        return Objects.equals(getEnabled(), that.getEnabled()) &&
               Objects.equals(getReplicas(), that.getReplicas()) &&
               Objects.equals(getImage(), that.getImage()) &&
               Objects.equals(getSpringProfilesActive(), that.getSpringProfilesActive()) &&
               Objects.equals(getDatasource(), that.getDatasource()) &&
               Objects.equals(getResources(), that.getResources()) &&
               Objects.equals(getLogging(), that.getLogging()) &&
               Objects.equals(getJavaToolOptions(), that.getJavaToolOptions()) &&
               Objects.equals(getBucketName(), that.getBucketName()) &&
               Objects.equals(getLivenessProbe(), that.getLivenessProbe()) &&
               Objects.equals(getReadinessProbe(), that.getReadinessProbe()) &&
               Objects.equals(getrbacEnabled(), that.getrbacEnabled()) &&
               Objects.equals(getsecretEnabled(), that.getsecretEnabled()) &&
               Objects.equals(getconfigMapEnabled(), that.getconfigMapEnabled()) &&
               Objects.equals(getingressEnabled(), that.getingressEnabled());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEnabled(), getReplicas(), getImage(), getSpringProfilesActive(),
                            getDatasource(), getResources(), getLogging(),
                            getJavaToolOptions(), getBucketName(), getLivenessProbe(),
                            getReadinessProbe(), getrbacEnabled(), getsecretEnabled(),
                            getconfigMapEnabled(), getingressEnabled());
    }
    // Inner classes for nested objects

    public static class Datasource {
        private String username;
        private String password;
        private String host;
        private Integer port;
        private String schema;

        public Datasource() {
        }

        public Datasource(String username, String password, String host, Integer port, String schema) {
            this.username = username;
            this.password = password;
            this.host = host;
            this.port = port;
            this.schema = schema;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

        @Override
        public String toString() {
            return "Datasource{" +
                    "username='" + username + '\'' +
                    ", password='[PROTECTED]'" +
                    ", host='" + host + '\'' +
                    ", port=" + port +
                    ", schema='" + schema + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Datasource)) return false;
            Datasource that = (Datasource) o;
            return Objects.equals(getUsername(), that.getUsername()) &&
                   Objects.equals(getPassword(), that.getPassword()) &&
                   Objects.equals(getHost(), that.getHost()) &&
                   Objects.equals(getPort(), that.getPort()) &&
                   Objects.equals(getSchema(), that.getSchema());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getUsername(), getPassword(), getHost(), getPort(), getSchema());
        }
    }

    public static class Resources {
        private ResourceDetails limits;
        private ResourceDetails requests;

        public Resources() {
        }

        public Resources(ResourceDetails limits, ResourceDetails requests) {
            this.limits = limits;
            this.requests = requests;
        }

        public ResourceDetails getLimits() {
            return limits;
        }

        public void setLimits(ResourceDetails limits) {
            this.limits = limits;
        }

        public ResourceDetails getRequests() {
            return requests;
        }

        public void setRequests(ResourceDetails requests) {
            this.requests = requests;
        }

        @Override
        public String toString() {
            return "Resources{" +
                    "limits=" + limits +
                    ", requests=" + requests +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Resources)) return false;
            Resources that = (Resources) o;
            return Objects.equals(getLimits(), that.getLimits()) &&
                   Objects.equals(getRequests(), that.getRequests());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getLimits(), getRequests());
        }
    }

    public static class ResourceDetails {
        private String cpu;
        private String memory;

        public ResourceDetails() {
        }

        public ResourceDetails(String cpu, String memory) {
            this.cpu = cpu;
            this.memory = memory;
        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        @Override
        public String toString() {
            return "ResourceDetails{" +
                    "cpu='" + cpu + '\'' +
                    ", memory='" + memory + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ResourceDetails)) return false;
            ResourceDetails that = (ResourceDetails) o;
            return Objects.equals(getCpu(), that.getCpu()) &&
                   Objects.equals(getMemory(), that.getMemory());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getCpu(), getMemory());
        }
    }

    public static class Logging {
        private String levelRoot;
        private String patternConsole;

        public Logging() {
        }

        public Logging(String levelRoot, String patternConsole) {
            this.levelRoot = levelRoot;
            this.patternConsole = patternConsole;
        }

        public String getLevelRoot() {
            return levelRoot;
        }

        public void setLevelRoot(String levelRoot) {
            this.levelRoot = levelRoot;
        }

        public String getPatternConsole() {
            return patternConsole;
        }

        public void setPatternConsole(String patternConsole) {
            this.patternConsole = patternConsole;
        }

        @Override
        public String toString() {
            return "Logging{" +
                    "levelRoot='" + levelRoot + '\'' +
                    ", patternConsole='" + patternConsole + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Logging)) return false;
            Logging that = (Logging) o;
            return Objects.equals(getLevelRoot(), that.getLevelRoot()) &&
                   Objects.equals(getPatternConsole(), that.getPatternConsole());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getLevelRoot(), getPatternConsole());
        }
    }

    public static class Probe {
        private String path;
        private Integer port;
        private Integer initialDelaySeconds;
        private Integer periodSeconds;
        private Integer failureThreshold;
        private Integer timeoutSeconds;

        public Probe() {
        }

        public Probe(String path, Integer port, Integer initialDelaySeconds,
                     Integer periodSeconds, Integer failureThreshold, Integer timeoutSeconds) {
            this.path = path;
            this.port = port;
            this.initialDelaySeconds = initialDelaySeconds;
            this.periodSeconds = periodSeconds;
            this.failureThreshold = failureThreshold;
            this.timeoutSeconds = timeoutSeconds;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getInitialDelaySeconds() {
            return initialDelaySeconds;
        }

        public void setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
        }

        public Integer getPeriodSeconds() {
            return periodSeconds;
        }

        public void setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
        }

        public Integer getFailureThreshold() {
            return failureThreshold;
        }

        public void setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
        }

        public Integer getTimeoutSeconds() {
            return timeoutSeconds;
        }

        public void setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public String toString() {
            return "Probe{" +
                    "path='" + path + '\'' +
                    ", port=" + port +
                    ", initialDelaySeconds=" + initialDelaySeconds +
                    ", periodSeconds=" + periodSeconds +
                    ", failureThreshold=" + failureThreshold +
                    ", timeoutSeconds=" + timeoutSeconds +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Probe)) return false;
            Probe that = (Probe) o;
            return Objects.equals(getPath(), that.getPath()) &&
                   Objects.equals(getPort(), that.getPort()) &&
                   Objects.equals(getInitialDelaySeconds(), that.getInitialDelaySeconds()) &&
                   Objects.equals(getPeriodSeconds(), that.getPeriodSeconds()) &&
                   Objects.equals(getFailureThreshold(), that.getFailureThreshold()) &&
                   Objects.equals(getTimeoutSeconds(), that.getTimeoutSeconds());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getPath(), getPort(), getInitialDelaySeconds(),
                                getPeriodSeconds(), getFailureThreshold(), getTimeoutSeconds());
        }
    }
}
