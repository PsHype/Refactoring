package com.powermock

import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@PrepareForTest(HelloWord)
@RunWith(PowerMockRunner)
@PowerMockRunnerDelegate(Sputnik)
class PowerMockIntegrationTest extends Specification {

    def "Name"() {
        given: ""
        PowerMockito.mockStatic(HelloWord)
        PowerMockito.when(HelloWord.get()).thenReturn("2")
        def get = HelloWord.get()
        assert get == "2"

    }
}