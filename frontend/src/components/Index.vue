<template>
    <div>
        <Number
            label="FileId"
            v-model="value.fileId"
            :editMode="editMode"
        />
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <div variant="outlined" class="my-2">
            <String
                label="Keywords"
                v-model="keywordsInput"
                :editMode="editMode"
                @keydown.enter="addKeywordsList"
            />
            <v-card v-if="value.keywords.length > 0" variant="outlined" class="pa-4 mt-2">
                <v-card-sub-title>
                    Keywords List
                </v-card-sub-title>
                <li v-for="(name, index) in value.keywords" :key="index">
                    {{ name }}
                </li>
            </v-card>
            <v-row class="ma-0 pa-0 mt-2">
                <v-spacer></v-spacer>
                <v-btn @click="addKeywordsList">
                    Keywords 추가
                </v-btn>
            </v-row>
            
            <StringDetailGrid
                label="Keywords"
                offline
                v-model="value.keywords"
                :editMode="editMode"
                @change="change"
            />
        </div>
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Index',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "indices",
        keywordsInput: null,
        value: {
            keywords: [],
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
        addKeywordsList() {
            if (this.keywordsInput !== null && this.keywordsInput !== '') {
                this.value.keywords.push(this.keywordsInput);
                this.keywordsInput = null; // null로 초기화
            }
        },
    },
}
</script>
